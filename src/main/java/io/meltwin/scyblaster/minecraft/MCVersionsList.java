package io.meltwin.scyblaster.minecraft;

public class MCVersionsList {
    public class VersionItem {
        public String id = "";
        public String type = "";
        public String url = "";
        public String time = "";
        public String releaseTime = "";
        public String sha1 = "";
        public int complianceLevel = 0;
    }

    public class LatestVersion {
        public String release = "";
        public String snapshot = "";
    }

    public LatestVersion latest;
    public VersionItem[] versions;

}
