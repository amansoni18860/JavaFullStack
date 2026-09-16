package com.miniproject.report;

public interface EmployeeReport {

    // ═══════════════════════════════════════════════
    // Static Method - Company Name
    // Called as: EmployeeReport.companyName()
    // ═══════════════════════════════════════════════
    static void companyName() {
        System.out.println(
        "╔══════════════════════════════════════════╗");
        System.out.println(
        "║       IndiaCorp Solutions Pvt Ltd         ║");
        System.out.println(
        "╚══════════════════════════════════════════╝");
    }

    // ═══════════════════════════════════════════════
    // Abstract Method - Must be implemented
    // ═══════════════════════════════════════════════
    void generateReport();

    // ═══════════════════════════════════════════════
    // Default Method - Optional Override
    // ═══════════════════════════════════════════════
    default void reportFooter() {
        System.out.println(
        "══════════ End of Report ══════════");
    }
}