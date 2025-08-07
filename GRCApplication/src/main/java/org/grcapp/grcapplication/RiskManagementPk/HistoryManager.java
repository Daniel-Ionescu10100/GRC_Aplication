package org.grcapp.grcapplication.RiskManagementPk;

import java.util.List;

public class HistoryManager {
    private List<RiskHistory> riskHistories;
    private List<MitigationHistory> mitigationHistories;
    private List<Review> reviewHistories;

    public void addRiskHistory(RiskHistory history) {
        // implementare
    }

    public List<RiskHistory> getRiskHistoryFor(Risk risk) {
        // implementare
        return null;
    }

    public void addMitigationHistory(MitigationHistory history) {
        // implementare
    }

    public List<MitigationHistory> getMitigationHistoryFor(MitigationPlan plan) {
        // implementare
        return null;
    }

    public void addReview(Review review) {
        // implementare
    }

    public List<Review> getReviewsFor(Risk risk) {
        // implementare
        return null;
    }
}
