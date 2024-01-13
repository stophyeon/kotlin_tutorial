//import jakarta.validation.Constraint
//import jakarta.validation.Payload
//import kotlin.reflect.KClass
//
//const val DEFAULT_PASSWORD_RULES : String ="""^(?=.*[a-zA-Z])((?=.*\d)(?=.*\W)).{8,16}${'$'}"""
//const val DEFAULT_PASSWORD_INVALID_MESSAGE ="비밀번호는 영문, 숫자, 특수문자를 포함 8자리 이상 입력하세요"
//@Constraint(validatedBy = [PasswordValid::class])
//@Target(AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//annotation class PasswordValid(
//        val patterns : Array<String> = [DEFAULT_PASSWORD_RULES],
//        val message : String = DEFAULT_PASSWORD_INVALID_MESSAGE,
//        val groups : Array<KClass<*>> = [],
//        val payload : Array<KClass<out Payload>> = []
//)
