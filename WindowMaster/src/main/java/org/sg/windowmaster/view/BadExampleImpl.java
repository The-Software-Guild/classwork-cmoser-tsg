package org.sg.windowmaster.view;

import org.sg.windowmaster.dto.LineItemInterface;

public class BadExampleImpl implements ViewInterface {
    @Override
    public LineItemInterface addItem() {
        return null;
    }

    @Override
    public String retrieveFamilyName() {
        return null;
    }

    @Override
    public String retrieveGivenName() {
        return null;
    }
}
