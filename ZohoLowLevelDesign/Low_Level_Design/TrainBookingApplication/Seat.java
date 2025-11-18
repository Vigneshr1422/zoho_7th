package ZohoLowLevelDesign.Low_Level_Design.TrainBookingApplication;

import java.util.*;
public class Seat {
    private final int number;
    private final boolean[] legs = new boolean[4]; // A->B, B->C, C->D, D->E

    public Seat(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public void free(int srcIdx, int destIdx) {
        for (int i = srcIdx; i < destIdx; i++)
            legs[i] = false;
    }
    public void occupy(int srcIdx, int destIdx) {
        for (int i = srcIdx; i < destIdx; i++)
            legs[i] = true;
    }

    public boolean CheckIsFree(int srcIdx, int destIdx) {
        for (int i = srcIdx; i < destIdx; i++) {
            if (legs[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isOnBoardAtStationIndex(int st) {
        if (st < 4 && legs[st]) return true;
        return st - 1 >= 0 && legs[st - 1];
    }/*
    🧩 What this function does:
public boolean isOnBoardAtStationIndex(int st) {
    if (st < 4 && legs[st]) return true;
    return st - 1 >= 0 && legs[st - 1];
}


This function checks whether a passenger is inside the train at a particular station.

🪑 Background:

Every seat has a legs[] array that tells which part of the route the seat is occupied.

For example —
Stations: A → B → C → D → E
Indexes : 0 1 2 3 4

If a passenger books from A → C,
then the seat is occupied in these legs:

A–B (legs[0]) = true
B–C (legs[1]) = true
C–D (legs[2]) = false
D–E (legs[3]) = false


So, legs = [true, true, false, false]

🧠 Step-by-step explanation:

if (st < 4 && legs[st]) return true;

If the seat is occupied from this station to the next one,
then the person is on board right now.

return st - 1 >= 0 && legs[st - 1];

If not, check if the seat was occupied in the previous leg
(meaning, the train just came from that station and the person hasn’t left yet).

🚆 Example (A→C booking)

legs = [true, true, false, false]

Station	Index	legs[index]	legs[index-1]	Onboard?
A	0	true	—	✅ yes
B	1	true	true	✅ yes
C	2	false	true	✅ yes
D	3	false	false	❌ no

So the passenger is inside from A → C,
and gets off at C.

🧾 In short:

👉 This function tells whether the passenger (or seat) is occupied at a particular station —
either going from this station or arriving at it.
    */
}
