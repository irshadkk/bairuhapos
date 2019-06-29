/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.floreantpos.ui.views;

import com.floreantpos.Messages;
import com.floreantpos.main.Application;
import com.floreantpos.ui.dialog.OkCancelOptionDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author bairuha technologies
 */
public class WaiterSelectionView extends OkCancelOptionDialog {

    private int selectedWaiterId;
    private String selectedWaiter;

    public WaiterSelectionView(java.util.List<com.floreantpos.model.base.BaseWaiter> lst) {
        super(Application.getPosWindow(), true);
        createUI(lst);

    }
    JTable jt;

    private void createUI(java.util.List<com.floreantpos.model.base.BaseWaiter> lst) {
        setTitle(Messages.getString("CookingInstructionSelectionView.1"));
        setTitlePaneText(Messages.getString("CookingInstructionSelectionView.1")); //$NON-NLS-1$
        getContentPanel().setBorder(new EmptyBorder(10, 20, 0, 20));

        String column[] = {"ID", "NAME", "MOB"};
        String rows[][] = new String[lst.size()][];
        for (int i = 0; i < lst.size(); i++) {

            String row[] = new String[3];
            row[0] = "" + lst.get(i).getId();
            row[1] = lst.get(i).getWaiterName();
            row[2] = lst.get(i).getWaiterMobile();
            rows[i] = row;
        }
        jt = new JTable(rows, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane scrollPane = new JScrollPane(jt);

        JPanel contentPanel = new JPanel(new MigLayout("fill,wrap 1,inset 0"));
        contentPanel.add(scrollPane, "grow");

        getContentPanel().add(contentPanel);
        jt.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // do some actions here, for example
                // print first column value from selected row
                System.out.println(jt.getValueAt(jt.getSelectedRow(), 0).toString());
                selectedWaiterId = Integer.parseInt(jt.getValueAt(jt.getSelectedRow(), 0).toString());
                selectedWaiter = jt.getValueAt(jt.getSelectedRow(), 1).toString();
                setCanceled(false);
                dispose();
            }
        });

    }

    @Override
    public void doOk() {
        setCanceled(false);
        dispose();

    }

    public int getSelectedWaiterId() {
        return selectedWaiterId;
    }

    public void setSelectedWaiterId(int selectedWaiterId) {
        this.selectedWaiterId = selectedWaiterId;
    }

    public String getSelectedWaiter() {
        return selectedWaiter;
    }

    public void setSelectedWaiter(String selectedWaiter) {
        this.selectedWaiter = selectedWaiter;
    }

}
