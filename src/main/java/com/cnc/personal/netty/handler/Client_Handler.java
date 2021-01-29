package com.cnc.personal.netty.handler;

import com.cnc.personal.netty.entity.Phone;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @program: netty
 * @description
 * @author: cys2222
 * @create: 2021-01-29 15:27
 **/
public class Client_Handler extends SimpleChannelInboundHandler<Phone> {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);

        Phone phone = new Phone("三星","S10");
        ctx.writeAndFlush(phone);

    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Phone phone) throws Exception {
        System.out.println("client received a message<Phone>");
        System.out.println(phone.toString());
    }
}
