/***********************************************************************
 * Module:  Club.java
 * Author:  Petar
 * Purpose: Defines the Class Club
 ***********************************************************************/

import java.io.File;

/**
 * @pdOid 193eb932-2e0c-4949-acef-fa0d60579e56
 */
public class Club {
    /**
     * @pdOid a1727b74-8e75-4f1a-b422-14d3a2e8be0c
     */
    private String name;
    /**
     * @pdOid 9963ef30-76b3-4514-95f5-1b4d8dbc1b33
     */
    private String address;
    /**
     * @pdOid 6df88d10-ef13-4aae-9670-413bfa871783
     */
    private int numberOfTables;
    /**
     * @pdOid 0d546580-65c9-41e1-b9f4-aad450fc6563
     */
    private int capacity;
    /**
     * @pdOid 4e3a9181-e5bf-41f1-8e23-8ab4d249c559
     */
    private File plan;

    public Club(String name, String address, int numberOfTables, int capacity, File plan) {
        this.name = name;
        this.address = address;
        this.numberOfTables = numberOfTables;
        this.capacity = capacity;
        this.plan = plan;
    }

    /**
     * @pdOid f0257abb-60ea-41cf-9117-5e0ba4bd8a9a
     */
    public String getName() {
        return name;
    }

    /**
     * @param newName
     * @pdOid 5a2e758b-b8cc-44bf-b622-93ceb5c89277
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * @pdOid 9c1e2c4b-2d2e-4c5d-a9e3-2531c37ec9a7
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param newAddress
     * @pdOid 6ef0d90f-7792-456e-b26f-2bbbb1c44190
     */
    public void setAddress(String newAddress) {
        address = newAddress;
    }

    /**
     * @pdOid 3dfe5e58-1620-40fc-b66d-58235e96933c
     */
    public int getNumberOfTables() {
        return numberOfTables;
    }

    /**
     * @param newNumberOfTables
     * @pdOid 429910e1-b650-4e09-b148-b6cdd5a21a75
     */
    public void setNumberOfTables(int newNumberOfTables) {
        numberOfTables = newNumberOfTables;
    }

    /**
     * @pdOid 4893862d-3b17-42b9-b4de-3b1e715d3f86
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param newCapacity
     * @pdOid 0b345c86-ec8a-47e1-9ae0-7a2aa8ff1eb1
     */
    public void setCapacity(int newCapacity) {
        capacity = newCapacity;
    }

    /**
     * @pdOid 03776745-ca2d-45e8-b314-45bba7115f42
     */
    public Club() {
        // TODO: implement
    }

    /**
     * @pdOid 711e3c38-638b-4053-b5f0-9f72476bf53c
     */
    public File getPlan() {
        return plan;
    }

    /**
     * @param newPlan
     * @pdOid 29cb5f4c-81ad-489c-ad89-1d2114d9363f
     */
    public void setPlan(File newPlan) {
        plan = newPlan;
    }

}