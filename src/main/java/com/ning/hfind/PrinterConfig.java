package com.ning.hfind;

public class PrinterConfig
{
    private boolean depthMode = false;
    private boolean endLineWithNull = false;

    public boolean depthMode()
    {
        return depthMode;
    }

    public void setDepthMode(boolean depthMode)
    {
        this.depthMode = depthMode;
    }

    public boolean endLineWithNull()
    {
        return endLineWithNull;
    }

    public void setEndLineWithNull(boolean endLineWithNull)
    {
        this.endLineWithNull = endLineWithNull;
    }
}
