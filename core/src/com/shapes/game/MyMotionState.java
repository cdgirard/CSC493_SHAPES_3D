package com.shapes.game;

import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.physics.bullet.linearmath.btMotionState;

public class MyMotionState extends btMotionState
{
	final ModelInstance instance;
	
	public MyMotionState(ModelInstance obj)
	{
		instance = obj;
	}
	
	@Override
	public void getWorldTransform(Matrix4 worldTrans)
	{
		worldTrans.set(instance.transform);
	}
	
	@Override
	public void setWorldTransform(Matrix4 worldTrans)
	{
		instance.transform.set(worldTrans);
	}

}
