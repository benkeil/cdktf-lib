package de.benkeil.builder.s3

import de.benkeil.permissions.IamPermissionScope
import de.benkeil.permissions.Permissions

enum class S3BucketPermissions(override val iamPermissions: Collection<Iam>) : Permissions<S3BucketPermissions.Iam> {
    Read(
        listOf(
            Iam.GetBucketLocation,
            Iam.GetObject,
            Iam.ListBucket,
        ),
    ),
    Write(
        listOf(
            Iam.ListBucketMultipartUploads,
            Iam.AbortMultipartUpload,
            Iam.PutObject,
        ),
    ),
    ;

    enum class Iam(override val scope: String = "s3") : IamPermissionScope {
        AbortMultipartUpload,
        GetBucketLocation,
        GetObject,
        ListBucket,
        ListBucketMultipartUploads,
        PutObject,
    }
}
