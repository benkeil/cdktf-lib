package de.benkeil.builder

import com.hashicorp.cdktf.providers.aws.data_aws_iam_policy_document.DataAwsIamPolicyDocumentStatement

interface Grantable {
    fun getArnsToGrant(): Collection<String>
}

interface GrantableBuilder {
    fun getStatements(): Collection<DataAwsIamPolicyDocumentStatement>
}

class GrantableBuilderImpl : de.benkeil.builder.GrantableBuilder {

    private val statements = mutableListOf<DataAwsIamPolicyDocumentStatement>()

    fun <T> grantPermissions(
        to: de.benkeil.builder.Grantable,
        vararg permissions: de.benkeil.builder.Permissions<T>
    ) where T : Enum<T>, T : de.benkeil.builder.IamPermissionScope {
        statements.add(
            DataAwsIamPolicyDocumentStatement.builder()
                .effect("Allow")
                .resources(to.getArnsToGrant().toList())
                .actions(permissions.toIamActions())
                .build()
        )
    }

    override fun getStatements(): Collection<DataAwsIamPolicyDocumentStatement> {
        TODO("Not yet implemented")
    }
}
