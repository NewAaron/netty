package com.cnc.personal.netty.bytebuf;


import io.netty.buffer.AbstractByteBuf;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;

/**
 * @program: netty
 * @description
 * @author: cys2222
 * @create: 2021-01-25 19:21
 **/
public class Test {
    public static void main(String[] args) {
        /**
         * 可变长 可池化 实现零拷贝
         * 1.PoolByteBuf缓存池 UnPoolByteBuf 非缓存池
         * 2.HeapByteBuf 堆内存 DirectByteBuf 直接内存
         */
        ByteBuf buf = Unpooled.buffer(100,1024);
        buf.writeInt(3);
        int i = buf.readInt();
        System.out.println(i);
        buf.readerIndex(0);
        i = buf.readInt();
        System.out.println(i);
        buf.setInt(0,90);
        buf.readerIndex(0);
        i = buf.readInt();
        System.out.println(i);


    }
}
