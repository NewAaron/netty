package com.cnc.personal.netty.handler;

import com.cnc.personal.netty.entity.Phone;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @program: netty
 * @description
 * @author: cys2222
 * @create: 2021-01-29 16:50
 **/
public class Server_Handler extends SimpleChannelInboundHandler<Phone> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Phone phone) throws Exception {
        System.out.println("Server received a message<Phone>, return to client");
        channelHandlerContext.writeAndFlush(phone);
    }
}
