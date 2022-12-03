package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository; //추상화, 구체화 등에 의존 중인 상태. DIP 위반

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
