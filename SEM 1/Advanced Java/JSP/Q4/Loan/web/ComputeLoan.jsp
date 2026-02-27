<%-- 
    Document   : ComputeLoan.jsp
    Created on : 5 Nov 2025, 4:16:09 pm
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Your Loan Details are as follows!</h1>
        <%
            double loanAmount = Double.parseDouble(request.getParameter("loanamount"));
            double years = Double.parseDouble(request.getParameter("years"));
            double annualInterestRate = 0;
            if(years <= 7){
                annualInterestRate = 5.35;
            }
            else if (years >= 8 && years <= 15){
                annualInterestRate = 5.5;
            }
            else if (years >= 16 && years <= 30){
                annualInterestRate = 5.75;
            }
            
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;
        %>
        <h1 style="font-size: 25px"> LoanAmount: <%= loanAmount %> </h1>
        
        <h1 style="font-size: 25px">Annual Interest Rate: <%= annualInterestRate %> </h1>
        
        <h1 style="font-size: 25px">Number of Years: <%= years %> </h1>
        
        <h1 style="font-size: 25px">MonthlyPayment: <%= monthlyPayment%> </h1>
        
        <h1 style="font-size: 25px">Total Payment: <%= totalPayment %> </h1>
        
    </body>
</html>
