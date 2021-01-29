package com.cnc.personal.netty.codec;

import com.cnc.personal.netty.entity.Phone;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;

import java.util.List;

/**
 * @program: netty
 * @description
 * @author: cys2222
 * @create: 2021-01-25 20:08
 **/
public class phone_codec_mtm extends MessageToMessageCodec<Phone, Phone> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Phone phone, List<Object> list) throws Exception {

    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, Phone phone, List<Object> list) throws Exception {

    }
}
