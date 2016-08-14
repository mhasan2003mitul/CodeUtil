package com.mhneo;

public class PrimeUtil{
    private BigInteger two = BigInteger.valueOf((long)2);
    private BigInteger three = BigInteger.valueOf((long)3);
    private BigInteger five = BigInteger.valueOf((long)5);
    private BigInteger six = BigInteger.valueOf((long)6);
    
    public boolean isPrimeForBigInteger(BigInteger num){
        if(num.compareTo(BigInteger.ONE) == 0 || num.compareTo(BigInteger.ONE) < 0){
            return false;
        }else if(num.compareTo(three) == 0 || num.compareTo(three) < 0){
            return true;
        }else if(num.mod(two).compareTo(BigInteger.ZERO) == 0 || num.mod(three).compareTo(BigInteger.ZERO) == 0 ){
            return false;
        }

        BigInteger nextSeq = five;
        
        while(nextSeq.multiply(nextSeq).compareTo(num) < 0 || nextSeq.multiply(nextSeq).compareTo(num) == 0){
            if(num.mod(nextSeq).compareTo(BigInteger.ZERO) == 0 || num.mod(nextSeq.add(two)).compareTo(BigInteger.ZERO) == 0){
                return false;
            }
            nextSeq = nextSeq.add(six);
        }        
        return true;
    }
    
    public boolean isPrime(int num){
       // System.out.println(num);
        if(num <= 1){
            return false;
        }else if(num <= 3){
            return true;
        }else if(num % 2 == 0 || num % 3 == 0 ){
            return false;
        }

        int nextSeq = 5;
        
        while(nextSeq * nextSeq <= num){
            if(num % nextSeq == 0 || num % (nextSeq + 2) == 0){
                return false;
            }
            nextSeq = nextSeq + 6;
        }        
        return true;
    }    
}
