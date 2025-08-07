package org.grcapp.grcapplication.RiskManagementPk;

import org.grcapp.grcapplication.User;

import java.util.Date;

public class Risk {
    private int id;
    private String title;
    private String category;
    private String active;
    private String description;
    private int probability;
    private int impact;
    private int easeExploite;
    private int riskScore;
    private String status;
    private User submittedBy;
    private Date createdAt;

    public void submit() {
        // implementare
    }

    public void updateRiskLevel() {
        // implementare
    }

    // Getteri și setteri
}
