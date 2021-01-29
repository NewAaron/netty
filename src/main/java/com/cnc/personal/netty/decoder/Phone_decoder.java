package com.cnc.personal.netty.decoder;

import com.cnc.personal.netty.entity.Phone;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static com.cnc.personal.netty.entity.Phone.phone_no;

/**
 * @program: netty
 * @description
 * @author: cys2222
 * @create: 2021-01-25 19:53
 **/
public class Phone_decoder extends ByteToMessageDecoder {
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        int code = byteBuf.readInt();
        if(phone_no==code){
            int bl = byteBuf.readInt();
            byte[] bb = new byte[bl];
            byteBuf.readBytes(bb);
            int ml = byteBuf.readInt();
            byte[] mb = new byte[ml];
            byteBuf.readBytes(mb);

            String b = new String(bb, StandardCharsets.UTF_8);
            String m = new String(mb, StandardCharsets.UTF_8);

            Phone phone = new Phone(b,m);
            list.add(phone);
        }else{
            //byteBuf的计数器加一 当为0时会被销毁
            byteBuf.retain();
            //将缓冲区丢到下一个解码器
            channelHandlerContext.fireChannelRead(byteBuf);
        }
    }
}
