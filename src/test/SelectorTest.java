package test;

import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class SelectorTest {
    public static void main(String[] args) throws Exception{
        //初始化选择器
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress("ip", 8080));
        //设置成非阻塞模式
        serverSocketChannel.configureBlocking(false);
        //在selector注册需要查询的事件
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        serverSocketChannel.register(selector, SelectionKey.OP_CONNECT);

        while(true){
            if(selector.select() < 0){
                continue;
            }
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterable = selectionKeys.iterator();
            while(iterable.hasNext()){
                SelectionKey selectionKey = iterable.next();
                //判断是什么事件就绪了
                if(selectionKey.isAcceptable()){            //如果有连接可以接收
                    //获取连接
                    ServerSocketChannel channel = (ServerSocketChannel)selectionKey.channel();
                    SocketChannel socketChannel = channel.accept();
                    socketChannel.configureBlocking(false);
                    //在selector上注册自己关注的事件
                    socketChannel.register(selector, SelectionKey.OP_READ);
                } else if (selectionKey.isConnectable()){   //如果是可连接状态
                    //doSomething...
                } else if (selectionKey.isReadable()){      //如果是可读了
                    //doSomething...
                } else if (selectionKey.isWritable()){      //如果可写了
                    //doSomething...
                }
            }
        }
    }
}
