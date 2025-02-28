interface jobHolder {
    void doWork();

    default void salaryShow()
    {
        System.out.println("Your salary is good");
    }
}