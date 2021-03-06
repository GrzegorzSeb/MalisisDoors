/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Ordinastie
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package net.malisis.doors.iconprovider;

import net.malisis.core.renderer.icon.Icon;
import net.malisis.core.renderer.icon.provider.IBlockIconProvider;
import net.malisis.doors.DoorDescriptor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;

/**
 * @author Ordinastie
 *
 */
public class SaloonDoorIconProvider implements IBlockIconProvider
{
	private Icon itemIcon;
	private Icon blockIcon;

	public SaloonDoorIconProvider(DoorDescriptor descriptor)
	{
		String modid = descriptor.getModId();
		String name = descriptor.getTextureName();

		itemIcon = Icon.from(modid + ":items/" + name);
		blockIcon = Icon.from(modid + ":blocks/" + name);
	}

	@Override
	public Icon getIcon(IBlockState state, EnumFacing side)
	{
		return blockIcon;
	}

	@Override
	public Icon getIcon()
	{
		return itemIcon;
	}
}
