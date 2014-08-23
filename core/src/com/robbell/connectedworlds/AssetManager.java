package com.robbell.connectedworlds;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetManager
{
	public static TextureRegion cloudTile;
	public static TextureRegion stoneTile;
	public static TextureRegion player;

	public static void load()
	{
		cloudTile = loadTextureRegion("cloud.png", 50, 36);
		stoneTile = loadTextureRegion("stone.png", 50, 38);
		player = loadTextureRegion("player.png", 14, 36);
	}
	
	private static TextureRegion loadTextureRegion(String fileName, int width, int height)
	{
		Texture texture = new Texture(Gdx.files.internal(fileName));
		texture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);

		TextureRegion region = new TextureRegion(texture, 0, 0, width, height);
		region.flip(false, true);
		
		return region;
	}
}
