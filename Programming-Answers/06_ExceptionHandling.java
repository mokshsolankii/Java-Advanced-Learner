class AgeNotEligibleException extends Exception {
    AgeNotEligibleException(String message) { super(message); }
}
class ExceptionHandling {
    static void register(int age) throws AgeNotEligibleException {
        if (age < 18) throw new AgeNotEligibleException("Must be at least 18");
        System.out.println("Registration successful");
    }
    public static void main(String[] args) {
        try { register(17); }
        catch (AgeNotEligibleException ex) { System.out.println("Error: " + ex.getMessage()); }
        finally { System.out.println("Registration check completed"); }
    }
}
