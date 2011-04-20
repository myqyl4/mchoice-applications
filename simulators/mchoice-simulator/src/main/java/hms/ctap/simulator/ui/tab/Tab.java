/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hms.ctap.simulator.ui.tab;

import hms.ctap.simulator.messagetable.ReceivedMessageTable;
import hms.ctap.simulator.messagetable.SentMessageTable;
import hms.ctap.simulator.ui.InputPanel;

/**
 *
 * @author hms
 */
public abstract class Tab {

    abstract public SentMessageTable getSentMessageTable();

    abstract public ReceivedMessageTable getReceivedMessageTable();

    abstract public InputPanel getInputPanel();


}
