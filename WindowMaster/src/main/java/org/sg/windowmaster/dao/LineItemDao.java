package org.sg.windowmaster.dao;

import org.sg.windowmaster.dto.LineItemInterface;

import java.util.ArrayList;
import java.util.List;

public class LineItemDao {

    private List<LineItemInterface> lineItems = new ArrayList<>();

    public void addItem(LineItemInterface lineItem) {
        lineItems.add(lineItem);
    }

    public List<LineItemInterface> getItems(){
        return lineItems;
    }
}
