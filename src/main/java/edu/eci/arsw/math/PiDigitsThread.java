package edu.eci.arsw.math;

import java.util.stream.IntStream;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Getter
public class PiDigitsThread extends Thread {
    private int start;
    private int end;
    
    @Override
    public void run(){
        IntStream.range(start,end).forEach(i-> System.out.print(i));
    }
}
