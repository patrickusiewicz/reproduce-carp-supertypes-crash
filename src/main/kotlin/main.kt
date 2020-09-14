import dk.cachet.carp.protocols.domain.ProtocolOwner
import dk.cachet.carp.protocols.domain.StudyProtocol
import dk.cachet.carp.protocols.infrastructure.toJson

fun main() {
   val owner = ProtocolOwner()
   val protocol = StudyProtocol( owner, "Protocol name" )

   // Force crash
   protocol.getSnapshot().toJson()
}
