/***********************************************************************
 * Module:  Table.java
 * Author:  Petar
 * Purpose: Defines the Class Table
 ***********************************************************************/

import java.util.Iterator;

/**
 * @pdOid 0a11cf24-1358-453f-bd21-9c503f58383f
 */
public class Table {
    /**
     * @pdOid 19df7972-bb31-4a24-bbe1-3e1e8a27486d
     */
    private int capacity;
    /**
     * @pdOid 75a1d963-295b-4e71-b126-fb5a941332bb
     */
    private String requirement;

    /**
     * @pdRoleInfo migr=no name=BarTable assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Aggregation
     */
    public java.util.Collection<BarTable> barTable;
    /**
     * @pdRoleInfo migr=no name=Separe assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Aggregation
     */
    public java.util.Collection<Separe> separe;
    /**
     * @pdRoleInfo migr=no name=HangingTable assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Aggregation
     */
    public java.util.Collection<HangingTable> hangingTable;

    /**
     * @pdOid c5d60ad4-4ab5-4085-bda6-0959b4f1d392
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param newCapacity
     * @pdOid 9b1f9500-73cc-4c87-814d-105c275d771f
     */
    public void setCapacity(int newCapacity) {
        capacity = newCapacity;
    }

    /**
     * @pdOid 83404c1a-f863-4b6f-bb2c-0ee770c8b8af
     */
    public Table() {
        // TODO: implement
    }

    /**
     * @pdOid 97608698-1f82-47f5-ad65-c35f17154390
     */
    public String getRequirement() {
        return requirement;
    }

    /**
     * @param newRequirement
     * @pdOid cad8ac61-164f-4d24-a031-2b64e7e99ed2
     */
    public void setRequirement(String newRequirement) {
        requirement = newRequirement;
    }


    /**
     * @pdGenerated default getter
     */
    public java.util.Collection<BarTable> getBarTable() {
        if (barTable == null)
            barTable = new java.util.HashSet<BarTable>();
        return barTable;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public Iterator<BarTable> getIteratorBarTable() {
        if (barTable == null)
            barTable = new java.util.HashSet<BarTable>();
        return barTable.iterator();
    }

    /**
     * @param newBarTable
     * @pdGenerated default setter
     */
    public void setBarTable(java.util.Collection<BarTable> newBarTable) {
        removeAllBarTable();
        for (BarTable table : newBarTable) addBarTable(table);
    }

    /**
     * @param newBarTable
     * @pdGenerated default add
     */
    public void addBarTable(BarTable newBarTable) {
        if (newBarTable == null)
            return;
        if (this.barTable == null)
            this.barTable = new java.util.HashSet<BarTable>();
        if (!this.barTable.contains(newBarTable))
            this.barTable.add(newBarTable);
    }

    /**
     * @param oldBarTable
     * @pdGenerated default remove
     */
    public void removeBarTable(BarTable oldBarTable) {
        if (oldBarTable == null)
            return;
        if (this.barTable != null)
            this.barTable.remove(oldBarTable);
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllBarTable() {
        if (barTable != null)
            barTable.clear();
    }

    /**
     * @pdGenerated default getter
     */
    public java.util.Collection<Separe> getSepare() {
        if (separe == null)
            separe = new java.util.HashSet<Separe>();
        return separe;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public Iterator<Separe> getIteratorSepare() {
        if (separe == null)
            separe = new java.util.HashSet<Separe>();
        return separe.iterator();
    }

    /**
     * @param newSepare
     * @pdGenerated default setter
     */
    public void setSepare(java.util.Collection<Separe> newSepare) {
        removeAllSepare();
        for (Separe value : newSepare) addSepare(value);
    }

    /**
     * @param newSepare
     * @pdGenerated default add
     */
    public void addSepare(Separe newSepare) {
        if (newSepare == null)
            return;
        if (this.separe == null)
            this.separe = new java.util.HashSet<Separe>();
        if (!this.separe.contains(newSepare))
            this.separe.add(newSepare);
    }

    /**
     * @param oldSepare
     * @pdGenerated default remove
     */
    public void removeSepare(Separe oldSepare) {
        if (oldSepare == null)
            return;
        if (this.separe != null)
            this.separe.remove(oldSepare);
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllSepare() {
        if (separe != null)
            separe.clear();
    }

    /**
     * @pdGenerated default getter
     */
    public java.util.Collection<HangingTable> getHangingTable() {
        if (hangingTable == null)
            hangingTable = new java.util.HashSet<HangingTable>();
        return hangingTable;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public Iterator<HangingTable> getIteratorHangingTable() {
        if (hangingTable == null)
            hangingTable = new java.util.HashSet<HangingTable>();
        return hangingTable.iterator();
    }

    /**
     * @param newHangingTable
     * @pdGenerated default setter
     */
    public void setHangingTable(java.util.Collection<HangingTable> newHangingTable) {
        removeAllHangingTable();
        for (HangingTable table : newHangingTable) addHangingTable(table);
    }

    /**
     * @param newHangingTable
     * @pdGenerated default add
     */
    public void addHangingTable(HangingTable newHangingTable) {
        if (newHangingTable == null)
            return;
        if (this.hangingTable == null)
            this.hangingTable = new java.util.HashSet<HangingTable>();
        if (!this.hangingTable.contains(newHangingTable))
            this.hangingTable.add(newHangingTable);
    }

    /**
     * @param oldHangingTable
     * @pdGenerated default remove
     */
    public void removeHangingTable(HangingTable oldHangingTable) {
        if (oldHangingTable == null)
            return;
        if (this.hangingTable != null)
            this.hangingTable.remove(oldHangingTable);
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllHangingTable() {
        if (hangingTable != null)
            hangingTable.clear();
    }

}