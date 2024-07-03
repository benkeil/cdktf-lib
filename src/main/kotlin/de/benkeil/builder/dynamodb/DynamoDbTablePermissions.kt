package de.benkeil.builder.dynamodb

import de.benkeil.permissions.IamPermissionScope
import de.benkeil.permissions.Permissions

enum class DynamoDbTablePermissions(override val iamPermissions: Collection<Iam>) :
    Permissions<DynamoDbTablePermissions.Iam> {
    Read(
        listOf(
            Iam.GetItem,
            Iam.BatchGetItem,
            Iam.Query
        )
    ),
    Write(
        listOf(
            Iam.PutItem,
            Iam.BatchWriteItem,
            Iam.UpdateItem
        )
    ),
    Delete(listOf(Iam.DeleteItem, Iam.BatchWriteItem)),
    Scan(listOf(Iam.Scan)),
    Stream(
        listOf(
            Iam.DescribeStream,
            Iam.GetRecords,
            Iam.GetShardIterator,
            Iam.ListStreams
        )
    ), ;

    enum class Iam(override val scope: String = "dynamodb") : IamPermissionScope {
        GetItem,
        BatchGetItem,
        Query,
        Scan,
        BatchWriteItem,
        PutItem,
        UpdateItem,
        DeleteItem,
        DescribeStream,
        GetRecords,
        GetShardIterator,
        ListStreams,
    }
}
