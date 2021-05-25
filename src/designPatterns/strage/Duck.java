/*
 * Copyright 2017 HugeGraph Authors
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package designPatterns.strage;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private ShoutBehavior shoutBehavior;

    public void swim() {
        System.out.println("我可以游泳");
    }

    abstract void display();

    // 模版方法模式，定义飞行和叫声的行为方法
    public void shout() {
        this.shoutBehavior.shout();
    }

    public void fly() {
        this.flyBehavior.fly();
    }

    // 策略模式，动态设置飞行、叫声行为
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setShoutBehavior(ShoutBehavior shoutBehavior) {
        this.shoutBehavior = shoutBehavior;
    }
}
