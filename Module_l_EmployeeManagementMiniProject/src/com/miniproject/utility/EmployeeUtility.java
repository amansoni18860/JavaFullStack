package com.miniproject.utility;

public class EmployeeUtility {

    // ═══════════════════════════════════════════════
    // Print Application Header
    // ═══════════════════════════════════════════════
    public static void printHeader() {
        System.out.println(
        "╔══════════════════════════════════════════╗");
        System.out.println(
        "║     Employee Management System           ║");
        System.out.println(
        "║     Java Streams & Functional Demo       ║");
        System.out.println(
        "╚══════════════════════════════════════════╝");
    }

    // ═══════════════════════════════════════════════
    // Print Section Divider
    // ═══════════════════════════════════════════════
    public static void printDivider() {
        System.out.println("═".repeat(50));
    }

    // ═══════════════════════════════════════════════
    // Print Footer
    // ═══════════════════════════════════════════════
    public static void printFooter() {
        System.out.println(
        "╔══════════════════════════════════════════╗");
        System.out.println(
        "║        Application Completed             ║");
        System.out.println(
        "╚══════════════════════════════════════════╝");
    }
}