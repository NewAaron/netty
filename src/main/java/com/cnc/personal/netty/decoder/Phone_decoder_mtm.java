package com.cnc.personal.netty.decoder;

import com.cnc.personal.netty.entity.Phone;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

/**
 * @program: netty
 * @description
 * @author: cys2222
 * @create: 2021-01-25 20:05
 **/
public class Phone_decoder_mtm extends MessageToMessageDecoder<Phone> {
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, Phone phone, List<Object> list) throws Exception {
        String m = phone.getModel();
        list.add(m);
    }
}
