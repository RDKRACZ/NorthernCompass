/*
 * Copyright 2019 Alex Thomson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.lxgaming.northerncompass.listener;

import io.github.lxgaming.northerncompass.item.property.AngleCompassProperty;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;

public class RegistryListener {
    
    @SubscribeEvent
    public void registerItem(RegistryEvent.Register<Item> event) {
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
            Items.COMPASS.addPropertyOverride(AngleCompassProperty.RESOURCE_LOCATION, new AngleCompassProperty());
        });
    }
}