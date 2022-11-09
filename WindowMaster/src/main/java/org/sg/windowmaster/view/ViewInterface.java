package org.sg.windowmaster.view;

import org.sg.windowmaster.dto.LineItemInterface;

public interface ViewInterface {

    public LineItemInterface addItem();

    public String retrieveFamilyName();

    public String retrieveGivenName();
}
