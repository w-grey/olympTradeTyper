package com.minidart.typewriter.entities;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;


public class MessageWriter {
    private static MessageWriter messageWriter;
    public static MessageWriter getMessageWriter() throws Exception{
        if (messageWriter==null) messageWriter=new MessageWriter();
        return messageWriter;
    }
    private Robot robot;
    private Map<Character,Integer> keyEventMap=new HashMap<Character, Integer>();
    private MessageWriter() throws Exception{
        robot=new Robot();
        for (int i=0,j=48;i<10;i++,j++){
            keyEventMap.put(Character.forDigit(i,10),j);
        }
    }
    public void writeMessage(String message,int length) throws Exception{
        for (int i=0;i<length;i++){
            robot.delay(10);
            robot.keyPress(KeyEvent.VK_DELETE);
            robot.delay(10);
            robot.keyRelease(KeyEvent.VK_DELETE);
        }
        for (int i=0;i<length;i++){
            robot.delay(10);
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.delay(10);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        }
        for (Character c:message.toCharArray()){
            robot.keyPress(keyEventMap.get(c));
            robot.delay(10);
            robot.keyRelease(keyEventMap.get(c));
            robot.delay(10);
        }
    }
}
