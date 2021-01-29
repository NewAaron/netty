package com.cnc.personal.netty.encoder;

import com.cnc.personal.netty.entity.Phone;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * @program: netty
 * @description
 * @author: cys2222
 * @create: 2021-01-25 19:51
 **/
public class Phone_encoder_mtm extends MessageToMessageEncoder<Phone> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Phone phone, List<Object> list) throws Exception {
        String phone_str = phone.toString();
        list.add(phone_str);
    }
}
