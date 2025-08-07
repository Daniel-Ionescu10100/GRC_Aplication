package org.grcapp.grcapplication.RiskManagementPk;

import org.grcapp.grcapplication.User;

import java.util.Date;

public class Review {
    private int id;
    private User reviewer;
    private String comments;
    private Date date;
    private int updatedRiskLevel; // presupun că e int, nu enum

    public void performReview() {
        // implementare
    }

    // Getteri și setteri
}
