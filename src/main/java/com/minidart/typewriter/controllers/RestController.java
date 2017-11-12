package com.minidart.typewriter.controllers;

import com.minidart.typewriter.containers.ResponseContainer;
import com.minidart.typewriter.entities.Message;
import com.minidart.typewriter.entities.MessageWriter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
@EnableAutoConfiguration
public class RestController {
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public ResponseContainer test(@RequestBody Message message){
        ResponseContainer responseContainer=new ResponseContainer();
        try {
            MessageWriter messageWriter=MessageWriter.getMessageWriter();
            messageWriter.writeMessage(message.getBet(),message.getLength());
            responseContainer.setStatus("OK");
        }
        catch (Exception e){
            e.printStackTrace();
            responseContainer.setStatus(e.getMessage());
        }
        return responseContainer;
    }
}
