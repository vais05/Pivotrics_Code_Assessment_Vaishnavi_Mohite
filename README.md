# Pivotrics Code Assessment

## Candidate Details

**Name:** Vaishnavi Mohite

**Language Used:** Java

---

# Question 1: Parking Lot System

## Problem Statement

Design and implement a simple parking lot system that can:
- Park vehicles
- Remove vehicles
- Locate available parking spots

The system supports different vehicle types:
- Motorcycle
- Car
- Truck

and different parking spot sizes:
- Small
- Medium
- Large

---

## Code Understanding

This solution follows Object-Oriented Programming (OOP) principles.

### Classes Used

- **Vehicle (Abstract Class)** – Base class for all vehicles.
- **Car, Motorcycle, Truck** – Derived classes representing different vehicle types.
- **ParkingSpot** – Represents an individual parking spot and checks whether a vehicle can fit.
- **ParkingLot** – Manages all parking spots and provides methods to park, remove, and display available spots.
- **VehicleType & SpotSize** – Enums used for better readability and maintainability.

### Working

1. Create parking spots with different sizes.
2. Create vehicles.
3. Search for the first available compatible spot.
4. Park the vehicle.
5. Remove a vehicle using its license plate.
6. Display remaining available spots.

### Time Complexity

- Park Vehicle → **O(n)**
- Remove Vehicle → **O(n)**
- Display Available Spots → **O(n)**

---

## Sample Output

### Output Screenshot

<img width="388" height="230" alt="image" src="https://github.com/user-attachments/assets/8d40b2ee-38ca-4dcb-9dde-783b9b866ae2" />


Example Output:

```text
MOTORCYCLE parked at Spot 1
CAR parked at Spot 2
TRUCK parked at Spot 3

Available Parking Spots:
Spot 4 (LARGE)

Vehicle removed successfully.

Available Parking Spots:
Spot 2 (MEDIUM)
Spot 4 (LARGE)
```

---

# Question 2: Number of Islands

## Problem Statement

Given a 2D grid of 0's and 1's, count the total number of islands.

An island is formed by adjacent land cells connected horizontally or vertically.

---

## Code Understanding

The solution uses **Depth First Search (DFS)**.

### Working

- Traverse every cell.
- Whenever a land cell ('1') is found:
  - Increase island count.
  - Perform DFS to visit all connected land cells.
- Mark visited cells as water ('0') to avoid revisiting.

### Time Complexity

**O(m × n)**

### Space Complexity

**O(m × n)** (Recursive Stack)

---

## Sample Output

### Output Screenshot

<img width="390" height="83" alt="image" src="https://github.com/user-attachments/assets/bb6a47ad-6d87-42c4-b57f-d33d89afab86" />


Example Output:

```text
Number of Islands = 3
```

---

# Question 3: Linked List Cycle Detection

## Problem Statement

Detect whether a singly linked list contains a cycle.

---

## Code Understanding

The solution uses **Floyd's Tortoise and Hare Algorithm**.

### Working

- Use two pointers:
  - Slow Pointer (moves one step)
  - Fast Pointer (moves two steps)
- If both pointers meet, a cycle exists.
- If the fast pointer reaches the end, no cycle exists.

### Time Complexity

**O(n)**

### Space Complexity

**O(1)**

---

## Sample Output

### Output Screenshot

<img width="391" height="86" alt="image" src="https://github.com/user-attachments/assets/b9dd9d96-7f29-4e08-babb-7ba4ab185bfa" />


Example Output:

```text
Cycle Detected
```

---

# How to Run

Navigate to each question folder.

Compile:

```bash
javac *.java
```

Run:

```bash
java Main
```

---

# Folder Structure

```
Pivotrics_Code_Assessment_Vaishnavi_Mohite
│
├── README.md
│
├── Question1_ParkingLot
│   ├── Main.java
│   ├── ParkingLot.java
│   ├── ParkingSpot.java
│   ├── Vehicle.java
│   ├── VehicleType.java
│   ├── SpotSize.java
│   ├── Car.java
│   ├── Motorcycle.java
│   └── Truck.java
│
├── Question2_NumberOfIslands
│   └── Main.java
│
└── Question3_LinkedListCycle
    └── Main.java
```
