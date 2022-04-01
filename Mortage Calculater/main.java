public static void main(String[] args) {
    final byte MONTHS_IN_YEAR=12;
    final byte PERCENT= 100;
    int principal=0;
    float monthlyInterest=0;
    int numberOfPayments=0;

    Scanner scanner=new Scanner(System.in);
    while (true){
        System.out.print("Principal: ");
        Principal=scanner.nextInt();
        if(principal>=1000 && principal <=1-000-000);
        break;
    System.out.print("Enter a value between 1000 and 1-000-000");
    }
    while(true){
        System.out.print("Annual Interest Rate: ");
        float annualInterest=scanner.nextFloat();
        if(annualInterest>=&&annualInterest<=39){
            monthlyInterest=annualInterest/PERCENT/MONTHLY
            break;
        }
    }
    while(true){
        System.out.println("Period (Years): ");
        byte years=scanner.nextByte();
        if (years>=1&&years<=30){
            numberOfPayments=years MONTHS-IN-YEAR;
            break;
        }
    }
    System.out.print("Enter a value between 1 & 30");
    {
    double mortgage=principal*(monthlyInterest*Math.pow(1+monthlyInterest))/(Math.pow(1+monthlyInterest,numberOfPayments)))
    string mortgageFormatted=NumberFormat.getCurrencyInt;
    System.out.println("Mortgage: "+ mortgageFormatted);
    }
}