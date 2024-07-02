package info.passdaily.holy_angles_staff.services.downloader.internal;

import info.passdaily.holy_angles_staff.services.downloader.Response;
import info.passdaily.holy_angles_staff.services.downloader.request.DownloadRequest;

public class SynchronousCall {

    public final DownloadRequest request;

    public SynchronousCall(DownloadRequest request) {
        this.request = request;
    }

    public Response execute() {
        DownloadTask downloadTask = DownloadTask.create(request);
        return downloadTask.run();
    }

}
