package com.cnc.personal.netty.encoder;

import com.cnc.personal.netty.entity.Phone;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import java.nio.charset.StandardCharsets;

import static com.cnc.personal.netty.entity.Phone.phone_no;

/**
 * @program: netty
 * @description
 * @author: cys2222
 * @create: 2021-01-25 19:45
 **/
public class Phone_encoder extends MessageToByteEncoder<Phone> {



    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Phone phone, ByteBuf byteBuf) throws Exception {
        String brand = phone.getBrand();
        String model = phone.getModel();
        byte[] b = brand.getBytes(StandardCharsets.UTF_8);
        byte[] m = model.getBytes(StandardCharsets.UTF_8);

        byteBuf.writeInt(phone_no);
        byteBuf.writeInt(b.length);
        byteBuf.writeBytes(b);
        byteBuf.writeInt(m.length);
        byteBuf.writeBytes(m);
    }
}
