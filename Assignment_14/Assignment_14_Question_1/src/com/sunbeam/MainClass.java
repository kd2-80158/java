package com.sunbeam;

import java.util.List;
import java.util.Scanner;

public class MainClass {
	
	public static int menu()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("************************************");
		System.out.println("0. Exit");
		System.out.println("1. Add Candidate");
		System.out.println("2. Delete Candidate");
		System.out.println("3. Update Candidate");
		System.out.println("4. Get All Candidates");
		System.out.println("5. Increment Candidate Vote");
		System.out.println("6. Get All Candidates of given party");
		System.out.println("7. Get party-wise vote count");
		System.out.println("*************************************");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt(); 
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ch;
		while((ch=menu())!=0)
		{
		switch(ch)
			{
		case 1:
			try(CandidateDao dao = new CandidateDao())
			{
				System.out.print("Enter id: ");
				int id = sc.nextInt();
				System.out.print("Enter name: ");
				String name = sc.next();
				System.out.println("Enter party: ");
				String party = sc.next();
				System.out.println("Enter votes: ");
				int votes = sc.nextInt();
			    int cnt = dao.addCandidate(new Candidate(id,name,party,votes));
			    System.out.println("New Candidate added: "+cnt);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			break;
		case 2:
			try(CandidateDao dao = new CandidateDao()) {
				System.out.print("Enter candidate id to be deleted: ");
				int id = sc.nextInt();
				int cnt = dao.deleteById(id);
				System.out.println("Candidate deleted: " + cnt);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 3:
			try(CandidateDao dao = new CandidateDao())
			{
				System.out.println("Enter candidate id for update: ");
				int id = sc.nextInt();
				System.out.print("Enter name: ");
				String name = sc.next();
				System.out.println("Enter party: ");
				String party = sc.next();
				int cnt = dao.updateById(new Candidate(id,name,party,0));
				System.out.println("Candidate updated: " + cnt);
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			break;
		case 4:
			try(CandidateDao dao = new CandidateDao())
			{
				List<Candidate> list = dao.findAll();
				list.forEach(x -> System.out.println(x));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			break;
		case 5:
			try(CandidateDao dao = new CandidateDao())
			{
				System.out.println("Enter candidate id to update: ");
				int id = sc.nextInt();
				int count = dao.incrementVote(id);
				System.out.println("Row affected :"+count);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			break;
		case 6:
			try(CandidateDao dao = new CandidateDao()) {
				System.out.print("Enter party: ");
				String party = sc.next();
				List<Candidate> list = dao.findByParty(party);
				list.forEach(c -> System.out.println(c));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 7:
			try(PartyVotesDao pao = new PartyVotesDao())
			{
				List<PartyVotes> list = pao.getPartywiseVotes();
				list.forEach(x -> System.out.println(x));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			break;
		}

	}
	}
}