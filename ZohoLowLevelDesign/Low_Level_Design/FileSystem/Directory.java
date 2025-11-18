package ZohoLowLevelDesign.Low_Level_Design.FileSystem;
import java.util.*;
public class Directory {
    String name;
    Directory parent;
    List<Directory> subDirectories;

    List<MyFiles> files=new ArrayList<>();

    public Directory(String name,Directory parent)
    {
        this.name=name;
        this.parent=parent;
        this.subDirectories=new ArrayList<>();

    }
    public  void createDirectory(String name)
    {
        subDirectories.add(new Directory(name,this));
        System.out.println("Directory created: " + name);

    }

    public void removeDirectory(String name)
    {
        for(int i=0;i<subDirectories.size();i++)
        {
            if(subDirectories.get(i).name.equals(name)){
                subDirectories.remove(i);
                System.out.println("Directory removed: " + name);
                return;
            }
        }
        System.out.println("Directory not found "+name);
    }

    public Directory moveToSubDirectory(String name){
        for(Directory d:subDirectories){
            if(d.name.equals(name)){
                return d;
            }
        }

        System.out.println("Invalid");
        return this;
    }

    public Directory moveToParent()
    {
        if(parent!=null)
        {
            return  parent;
        }
        System.out.println("Already at Home");
        return this;
    }

    public String getPath()
    {
        if(parent==null)
        {
            return name;
        }
        return parent.getPath()+"/"+name;
    }

    public void createFile(String name,String type,int n)
    {
        files.add(new MyFiles(name,type,n));
        System.out.println("File created "+name+" ( "+type+
        ", "+n+" KB ");
    }

    public void removeFile(String name){
        for(int i=0;i<files.size();i++){
          if(files.get(i).name.equals(name)){
                files.remove(i);
              System.out.println("File removed ");
                return;
            }
        }
        System.out.println("File not bound");

    }

    public void listAll(boolean sort)
    {
        List<Object> items = new ArrayList<>();
        items.addAll(subDirectories);
        items.addAll(files);

        if (sort) {
            items.sort((a, b) -> {
                int sizeA = (a instanceof Directory)
                        ? ((Directory) a).getDirectorySize()
                        : ((MyFiles) a).size;

                int sizeB = (b instanceof Directory)
                        ? ((Directory) b).getDirectorySize()
                        : ((MyFiles) b).size;

                return sizeA - sizeB;
            });
        }

        System.out.println("\nItems under: " + name);
        System.out.println("------------------------------------------------------------------");
        System.out.println("| TYPE | NAME            | FILE TYPE | SIZE (KB) | PATH          |");
        System.out.println("------------------------------------------------------------------");

        for (Object o : items) {

            if (o instanceof Directory) {
                Directory d = (Directory) o;
                System.out.printf("| %-4s | %-14s | %-9s | %-9d | %-13s |\n",
                        "DIR",
                        d.name,
                        "-",
                        d.getDirectorySize(),
                        d.getPath()
                );
            } else {
                MyFiles f = (MyFiles) o;
                System.out.printf("| %-4s | %-14s | %-9s | %-9d | %-13s |\n",
                        "FILE",
                        f.name,
                        f.type,
                        f.size,
                        this.getPath()
                );
            }
        }

        System.out.println("------------------------------------------------------------------\n");
    }


    public  int getDirectorySize()
    {
        int t=0;
        for(MyFiles k:files)
        {
            t+=k.size;
        }
        for(Directory d:subDirectories){
            t+=d.getDirectorySize();
        }
        return  t;
    }
    public void searchFile(String s){
        System.out.println("Search results for: " + s);
        System.out.println("--------------------------------------------------------------");
        System.out.println("| PATH                              | NAME        | TYPE | SIZE |");
        System.out.println("--------------------------------------------------------------");

        searchHelp(s.toLowerCase(), this, this.getPath());

        System.out.println("--------------------------------------------------------------");
    }

    public void searchHelp(String s, Directory current, String path)
    {
        for (MyFiles f : current.files) {
            if (f.name.toLowerCase().contains(s) ||
                    f.type.toLowerCase().contains(s)) {

                System.out.printf("| %-32s | %-10s | %-4s | %-4dKB |\n",
                        path + "/" + f.name,
                        f.name,
                        f.type,
                        f.size
                );
            }
        }

        for (Directory d : current.subDirectories) {
            searchHelp(s, d, path + "/" + d.name);
        }
    }


}
