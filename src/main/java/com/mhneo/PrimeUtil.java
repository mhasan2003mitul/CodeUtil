package com.mhneo;

public class PrimeUtil{

      public boolean isPrimeForBigInteger(BigInteger num){
        if(num.compareTo(one) == 0 || num.compareTo(one) < 0){
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
}
