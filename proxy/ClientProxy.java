package com.knifesurge.ToolExpansion.proxy;

import com.knifesurge.ToolExpansion.init.ToolExpansionBlocks;
import com.knifesurge.ToolExpansion.init.ToolExpansionItems;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenders()
	{
		ToolExpansionBlocks.registerRenders();
		ToolExpansionItems.registerRenders();
	}
	
}
