package org.lee.mugen.sprite.character;


import org.lee.mugen.parser.air.AirData;
import org.lee.mugen.parser.air.Rectangle;

public class AnimElement {
    private AirData _airData;


    
    public Integer getAddcolor() {
		return _airData.addcolor;
	}

	public Integer getDestcolor() {
		return _airData.destcolor;
	}

	public Integer getSubcolor() {
		return _airData.subcolor;
	}

	public float getXOffSet() {
        return _airData.xOffSet;
    }
    public float getYOffSet() {
        return _airData.yOffSet;
    }
    public boolean isMirrorV() {
        return _airData.isMirrorV;
    }
    public boolean isMirrorH() {
        return _airData.isMirrorH;
    }
    public int getDelay() {
        return _airData.delayTick;
    }
    public Rectangle[] getAtacksRec() {
    	return _airData.clsn1;
    }
    public Rectangle[] getCollisionsRec() {
    	return _airData.clsn2;
    }

    public AnimElement(AirData airData) {
        _airData = airData;
    }
	public AirData getAirData() {
		return _airData;
	}
     
}