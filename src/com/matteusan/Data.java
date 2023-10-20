package com.matteusan;

import com.matteusan.houses.*;
import com.matteusan.utils.DataUtilities;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Matthew Hernandez
 */
public final class Data {
    private static final String[] columnNames = {"Lot #", "Block", "Size", "House Type", "Price", "Status"};
    private static final Block[] blockList = {
        new Block("A", 20),
        new Block("B", 20),
        new Block("C", 20),
        new Block("D", 20),
        new Block("E", 20)
    };

    private final JTable referenceTable;
    DefaultTableModel referenceTableModel;
    private final TableRowSorter<DefaultTableModel> referenceTableSorter;

    public Data(JTable referenceTable) {
        this.referenceTable = referenceTable;
        referenceTableModel = new DefaultTableModel();
        referenceTableSorter = new TableRowSorter<>(referenceTableModel);
        referenceTable.setRowSorter(referenceTableSorter);
    }

    private RowFilter<TableModel, Object> filterByBlock(String query) {
        // System.out.println(query); // For debugging
        if (Objects.equals(query, "None")) return null;
        else return RowFilter.regexFilter(query, 1);
    }

    private RowFilter<TableModel, Object> filterBySize(String query) {
        int _query = Integer.parseInt(query);
        // System.out.println(_query); // For debugging
        int equivalentHundreds = (_query / 100) * 100;

        return RowFilter.regexFilter(String.valueOf(equivalentHundreds), 2);
    }

    private RowFilter<TableModel, Object> filterByPrice(String query) {
        int _query = Integer.parseInt(query);
        // System.out.println(_query); // For debugging
        int equivalentMillions = (_query / 1000000) * 1000000;

        return RowFilter.regexFilter(String.valueOf(equivalentMillions), 4);
    }

    private RowFilter<TableModel, Object> filterByHouseType(String query) {
        // System.out.println(query); // For debugging
        if (Objects.equals(query, "None")) return null;
        else return RowFilter.regexFilter(query, 3);
    }

    public void filter(String blockQuery, String sizeQuery, String priceQuery, String houseTypeQuery) {
        List<RowFilter<TableModel, Object>> filters = new ArrayList<>();

        if (!Objects.equals(blockQuery, "None")) filters.add(filterByBlock(blockQuery));
        if (!Objects.equals(sizeQuery, "") && !Objects.isNull(sizeQuery)) filters.add(filterBySize(sizeQuery));
        if (!Objects.equals(priceQuery, "") && !Objects.isNull(priceQuery)) filters.add(filterByPrice(priceQuery));
        if (!Objects.equals(houseTypeQuery, "None")) filters.add(filterByHouseType(houseTypeQuery));


        referenceTableSorter.setRowFilter(RowFilter.andFilter(filters));
    }

    public void populate() {
        Object[][] data = DataUtilities.getData(blockList);

        referenceTableModel.setColumnIdentifiers(columnNames);
        for (Object[] row : data) referenceTableModel.addRow(row);

        referenceTable.setModel(referenceTableModel);
    }

    public void updateRow(int row, int column, Object value) {
        referenceTableModel.setValueAt(value, row, column);
    }
}