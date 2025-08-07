package org.grcapp.grcapplication.RiskManagementPk;

import org.grcapp.grcapplication.User;

import java.util.Date;
import java.util.List;

public class MitigationHistory {
    private int id;
    private MitigationPlan mitigationPlan;
    private List<String> actions;
    private List<String> standards;
    private String status;
    private Date date;
    private User updatedBy;
}
